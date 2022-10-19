package polymorphism;

public class Main {

	public static void main(String[] args) {
		//EmailLogger logger = new EmailLogger();
		//DatabaseLogger databaseLogger = new DatabaseLogger();
		//logger.Log("Log mesajı");
		//databaseLogger.Log(":veri tabanı için");
		/*BaseLogger[] loggers =new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
		for (BaseLogger logger: loggers) {
			logger.Log(":Log mesajı");
		}*/
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
