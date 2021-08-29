package com.smakslow.javapractice.utils;

public class SnowflakeIdWorker {
    /**
     * ��ʼʱ�䣺2020-01-01 00:00:00
     */
    private final long beginTs = 1577808000000L;

    private final long workerIdBits = 10;

    /**
     * 2^10 - 1 = 1023
     */
    private final long maxWorkerId = -1L ^ (-1L << workerIdBits);

    private final long sequenceBits = 12;

    /**
     * 2^12 - 1 = 4095
     */
    private final long maxSequence = -1L ^ (-1L << sequenceBits);

    /**
     * ʱ�������22λ
     */
    private final long timestampLeftOffset = workerIdBits + sequenceBits;

    /**
     * ҵ��ID����12λ
     */
    private final long workerIdLeftOffset = sequenceBits;

    /**
     * �ϲ��˻���ID�����ݱ�ʾID��ͳ��ҵ��ID��10λ
     */
    private long workerId;

    /**
     * ���������У�12λ��2^12 = 4096������
     */
    private long sequence = 0L;

    /**
     * ��һ�����ɵ�ID��ʱ�����ͬһ��worker��
     */
    private long lastTimestamp = -1L;

    public SnowflakeIdWorker(long workerId) {
        if (workerId > maxWorkerId || workerId < 0) {
            throw new IllegalArgumentException(String.format("WorkerId������ڻ����0��С�ڻ����%d", maxWorkerId));
        }

        this.workerId = workerId;
    }

    public synchronized long nextId() {
        long ts = System.currentTimeMillis();
        if (ts < lastTimestamp) {
            throw new RuntimeException(String.format("ϵͳʱ�ӻ�����%d����", (lastTimestamp - ts)));
        }

        // ͬһʱ���ڣ���������к�
        if (ts == lastTimestamp) {
            // ���к����
            if (++sequence > maxSequence) {
                ts = tilNextMillis(lastTimestamp);
                sequence = 0L;
            }
        } else {
            // ʱ����ı䣬�������к�
            sequence = 0L;
        }

        lastTimestamp = ts;

        // 0 - 00000000 00000000 00000000 00000000 00000000 0 - 00000000 00 - 00000000 0000
        // ���ƺ󣬵�λ��0�����а�λ�������൱�ڶ�����ƴ��
        // ������λ���и�0<<63��0���κ����ְ�λ���Ǳ�������д��дЧ��һ��
        return (ts - beginTs) << timestampLeftOffset | workerId << workerIdLeftOffset | sequence;
    }

    /**
     * ��������һ������
     *
     * @param lastTimestamp
     * @return
     */
    private long tilNextMillis(long lastTimestamp) {
        long ts = System.currentTimeMillis();
        while (ts <= lastTimestamp) {
            ts = System.currentTimeMillis();
        }

        return ts;
    }

    public static void main(String[] args) {
        SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker(7);
        for (int i = 0; i < 10; i++) {
            long id = snowflakeIdWorker.nextId();
            System.out.println(id);
        }
    }
}
