-XX:+UseParallelGC	Full GC����parallel MSC (�������֤)		ѡ�������ռ���Ϊ�����ռ���.�����ý����������Ч.������������,�����ʹ�ò����ռ�,
�����ϴ��Ծ�ʹ�ô����ռ�.(�������֤)
-XX:+UseParNewGC	���������Ϊ�����ռ�		����CMS�ռ�ͬʱʹ�� JDK5.0����,JVM�����ϵͳ������������,�������������ô�ֵ
-XX:ParallelGCThreads	�����ռ������߳���		��ֵ��������봦������Ŀ��� ͬ��������CMS
-XX:+UseParallelOldGC	���ϴ������ռ���ʽΪ�����ռ�(Parallel Compacting)		�����JAVA 6���ֵĲ���ѡ��
-XX:MaxGCPauseMillis	ÿ��������������յ��ʱ��(�����ͣʱ��)		����޷������ʱ��,JVM���Զ������������С,�������ֵ.
-XX:+UseAdaptiveSizePolicy	�Զ�ѡ�����������С����Ӧ��Survivor������		���ô�ѡ���,�����ռ������Զ�ѡ�����������С����Ӧ��Survivor������,
�ԴﵽĿ��ϵͳ�涨�������Ӧʱ������ռ�Ƶ�ʵ�,��ֵ����ʹ�ò����ռ���ʱ,һֱ��.
-XX:GCTimeRatio	������������ʱ��ռ��������ʱ��İٷֱ�		��ʽΪ1/(1+n)
-XX:+ScavengeBeforeFullGC	Full GCǰ����YGC	true	Do young generation GC prior to a full GC. (Introduced in 1.4.1.)