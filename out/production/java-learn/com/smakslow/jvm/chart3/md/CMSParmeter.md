-XX:+UseConcMarkSweepGC	ʹ��CMS�ڴ��ռ�		��������������Ժ�,-XX:NewRatio=4������ʧЧ��,ԭ����.����,��ʱ�������С�����-Xmn����.???
-XX:+AggressiveHeap			��ͼ��ʹ�ô����������ڴ� ��ʱ����ڴ�ʹ�õ��Ż����ܼ�������Դ���ڴ棬 ������������ ������Ҫ256MB�ڴ� ������CPU���ڴ棬 ����1.4.1��4CPU�Ļ������Ѿ���ʾ��������
-XX:CMSFullGCsBeforeCompaction	���ٴκ�����ڴ�ѹ��		���ڲ����ռ��������ڴ�ռ����ѹ��,����,��������һ��ʱ���Ժ�����"��Ƭ",ʹ������Ч�ʽ���.��ֵ�������ж��ٴ�GC�Ժ���ڴ�ռ����ѹ��,����.
-XX:+CMSParallelRemarkEnabled	���ͱ��ͣ��		
-XX+UseCMSCompactAtFullCollection	��FULL GC��ʱ�� �����ϴ���ѹ��		CMS�ǲ����ƶ��ڴ�ģ� ��ˣ� ����ǳ����ײ�����Ƭ�� �����ڴ治���ã� ��ˣ� �ڴ��ѹ�����ʱ��ͻᱻ���á� ������������Ǹ���ϰ�ߡ� ���ܻ�Ӱ������,���ǿ���������Ƭ
-XX:+UseCMSInitiatingOccupancyOnly	ʹ���ֶ������ʼ�����忪ʼCMS�ռ�		��ֹhostspot���д���CMS GC
-XX:CMSInitiatingOccupancyFraction=70	ʹ��cms��Ϊ�������� ʹ��70����ʼCMS�ռ�	92	Ϊ�˱�֤������promotion failed(���������)����,��ֵ��������Ҫ�������¹�ʽCMSInitiatingOccupancyFraction���㹫ʽ
-XX:CMSInitiatingPermOccupancyFraction	����Perm Genʹ�õ�����ٱ���ʱ����	92	
-XX:+CMSIncrementalMode	����Ϊ����ģʽ		���ڵ�CPU���
-XX:+CMSClassUnloadingEnabled