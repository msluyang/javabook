package online.javabook.pattern.thread.readwritelock1;


/**
 * 
 * @author Summer Lu
 * @email gmluyang@gmail.com
 * @date 2015年7月19日
 *
 */
public class Resource {
	
	/**
	 * buffer
	 */
	private final char[] buffer;

	/**
	 * @param size
	 */
	public Resource(int size) {
		this.buffer = new char[size];
		for (int index = 0; index < buffer.length; index++) {
			buffer[index] = '*';
		}
	}

	/**
	 * @return
	 * @throws InterruptedException
	 */
	public synchronized char[] read() throws InterruptedException {
		return doRead();
	}

	/**
	 * @return
	 */
	private char[] doRead() {
		char[] newbuf = new char[buffer.length];
		for (int i = 0; i < buffer.length; i++) {
			newbuf[i] = buffer[i];
		}
		slowly();
		return newbuf;
	}

	/**
	 * @param c
	 * @throws InterruptedException
	 */
	public synchronized void write(char c) throws InterruptedException {
		doWrite(c);
	}

	/**
	 * @param c
	 */
	private void doWrite(char c) {
		for (int index = 0; index < buffer.length; index++) {
			buffer[index] = c;
			slowly();
		}
	}

	/**
	 * 
	 */
	private void slowly() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
		}
	}
}
