��������	����	Ĭ��ֵ	
-Xms	��ʼ�Ѵ�С	�ڴ��1/64	Ĭ��(MinHeapFreeRatio�������Ե���)������ڴ�С��40%ʱ��JVM�ͻ������ֱ��-Xmx���������.
-Xmx	���Ѵ�С	�ڴ��1/4	Ĭ��(MaxHeapFreeRatio�������Ե���)������ڴ����70%ʱ��JVM����ٶ�ֱ�� -Xms����С����
-Xmn	�������С		ע�⣺�˴��Ĵ�С�ǣ�eden+ 2 survivor space).��jmap -heap����ʾ��New gen�ǲ�ͬ�ġ� �����Ѵ�С=�������С + ���ϴ���С + �־ô���С. �����������,�����С���ϴ���С.��ֵ��ϵͳ����Ӱ��ϴ�,Sun�ٷ��Ƽ�����Ϊ�����ѵ�3/8
-XX:NewSize	�����������С		
-XX:MaxNewSize	��������ֵ		
-XX:PermSize	���ó־ô�(perm gen)��ʼֵ	�ڴ��1/64	JDK1.8��ǰ
-XX:MaxPermSize	���ó־ô����ֵ	�ڴ��1/4	JDK1.8��ǰ
-Xss	ÿ���̵߳Ķ�ջ��С		JDK5.0�Ժ�ÿ���̶߳�ջ��СΪ1M,��ǰÿ���̶߳�ջ��СΪ256K.����Ӧ�õ��߳������ڴ��С���� ����.����ͬ�����ڴ���,��С���ֵ�����ɸ�����߳�.���ǲ���ϵͳ��һ�������ڵ��߳������������Ƶ�,������������,����ֵ��3000~5000���� һ��С��Ӧ�ã� ���ջ���Ǻ�� Ӧ����128k���õ� ���Ӧ�ý���ʹ��256k�����ѡ�������Ӱ��Ƚϴ���Ҫ�ϸ�Ĳ��ԡ���У���� ��threadstacksizeѡ����ͺ�����,�ٷ��ĵ��ƺ�û�н���,����̳��������һ�仰:"�� -Xss is translated in a VM flag named ThreadStackSize�� һ���������ֵ�Ϳ����ˡ�
-XX:ThreadStackSize	Thread Stack Size		(0 means use default stack size) [Sparc: 512; Solaris x86: 320 (was 256 prior in 5.0 and earlier); Sparc 64 bit: 1024; Linux amd64: 1024 (was 0 in 5.0 and earlier); all others 0.]
-XX:NewRatio	�����(����Eden������Survivor��)�����ϴ��ı�ֵ(��ȥ�־ô�)		-XX:NewRatio=4��ʾ����������ϴ���ռ��ֵΪ1:4,�����ռ������ջ��1/5 Xms=Xmx����������Xmn������£��ò�������Ҫ�������á�
-XX:SurvivorRatio	Eden����Survivor���Ĵ�С��ֵ		����Ϊ8,������Survivor����һ��Eden���ı�ֵΪ2:8,һ��Survivor��ռ�����������1/10
-XX:LargePageSizeInBytes	�ڴ�ҳ�Ĵ�С�������ù��� ��Ӱ��Perm�Ĵ�С		=128m
-XX:+UseFastAccessorMethods	ԭʼ���͵Ŀ����Ż�		
-XX:+DisableExplicitGC	�ر�System.gc()		���������Ҫ�ϸ�Ĳ���
-XX:+ExplicitGCInvokesConcurrent	�ر�System.gc()	disabled	Enables invoking of concurrent GC by using the System.gc() request. This option is disabled by default and can be enabled only together with the -XX:+UseConcMarkSweepGC option.
-XX:+ExplicitGCInvokesConcurrentAndUnloadsClasses	�ر�System.gc()	disabled	Enables invoking of concurrent GC by using the System.gc() request and unloading of classes during the concurrent GC cycle. This option is disabled by default and can be enabled only together with the -XX:+UseConcMarkSweepGC option.
-XX:MaxTenuringThreshold	�����������		�������Ϊ0�Ļ�,����������󲻾���Survivor��,ֱ�ӽ������ϴ�. �������ϴ��Ƚ϶��Ӧ��,�������Ч��.�������ֵ����Ϊһ���ϴ�ֵ,��������������Survivor�����ж�θ���,�����������Ӷ�����������Ĵ�� ʱ��,������������������յĸ��� �ò���ֻ���ڴ���GCʱ����Ч.
-XX:+AggressiveOpts	�ӿ����		
-XX:+UseBiasedLocking	�����Ƶ����ܸ���		
-Xnoclassgc	������������		
-XX:SoftRefLRUPolicyMSPerMB	ÿ�׶ѿ��пռ���SoftReference�Ĵ��ʱ��	1s	softly reachable objects will remain alive for some amount of time after the last time they were referenced. The default value is one second of lifetime per free megabyte in the heap
-XX:PretenureSizeThreshold	���󳬹������ֱ���ھ���������	0	��λ�ֽ� ����������Parallel Scavenge GCʱ��Ч ��һ��ֱ���ھ��������������Ǵ���������,�����������ⲿ���ö���.
-XX:TLABWasteTargetPercent	TLABռeden���İٷֱ�	1%	
-XX:+CollectGen0First	FullGCʱ�Ƿ���YGC	false	

Jdk7�汾����Ҫ����

��������	����	Ĭ��ֵ	
-XX:PermSize	���ó־ô�		Jdk7�汾����ǰ�汾
-XX:MaxPermSize	�������־ô�		Jdk7�汾����ǰ�汾


Jdk8�汾����Ҫ���в���

��������	����	Ĭ��ֵ	
-XX:MetaspaceSize	Ԫ�ռ��С		Jdk8�汾
-XX:MaxMetaspaceSize	���Ԫ�ռ�		Jdk8�汾
