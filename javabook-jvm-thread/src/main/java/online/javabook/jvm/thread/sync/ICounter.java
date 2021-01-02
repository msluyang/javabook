package online.javabook.jvm.thread.sync;

/**
 * @author Summer Lu
 * @email gmluyang@gmail.com
 * @date 2015-1-27
 *
 */
public interface ICounter {

	/**
	 * 返回当前值
	 * 
	 * @return
	 */
	public long get();

	/**
	 * 递增当前值
	 * 
	 * @return
	 */
	public long increment();

	/**
	 * 递减当前值
	 * 
	 * @return
	 */
	public long decrement();
}