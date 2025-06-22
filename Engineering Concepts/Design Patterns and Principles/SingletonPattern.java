//Superset Id: 6385480
class Logger {
    private static Logger log;

    private Logger() {
        System.out.println("Instance");
    }

    public static Logger getInstance() {
        if (log == null) {
            log = new Logger();
        }
        return log;
    }
}

class SingletonPattern {
    public static void main(String args[]) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        if (log1 == log2)
            System.out.println("Both are same");
    }
}
