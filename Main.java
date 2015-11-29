import java.lang.Thread.UncaughtExceptionHandler;

public class Main {

	public static class ExceptionHandler implements UncaughtExceptionHandler {
		public void uncaughtException(Thread t, Throwable e) {
			System.out.println("Unhandled Masakari.");
		}
	}

	public static void main(String... args) throws Exception {
		Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler());
		try {
			throw new Masakari();
		} catch (Throwable t) {
			System.out.println("Catch Masakari.");
		}
	}
}
