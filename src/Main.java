public class Main {
    public static void task1Solution() {
        DatabaseHelper database = new DatabaseHelper();
//        database.connect();
        final String createTableSQL = "CREATE TABLE Comments "+
                "(ComPK SERIAL PRIMARY KEY,"+
                "username VARCHAR(50) NOT NULL,"+
                "creationdate DATE NOT NULL DEFAULT now(),"+
                "message TEXT NOT NULL);";

        database.createTable(createTableSQL);

        Comment comment = new Comment("Tom", "Tom's message");
        database.insertComment(comment);
        comment = new Comment("John", "Johns message");
        database.insertComment(comment);
        comment = new Comment("Ola", "Ola's message");
        database.insertComment(comment);
        comment = new Comment("Marina", "Marina's message");
        database.insertComment(comment);
        comment = new Comment("Den", "Den's message");
        database.insertComment(comment);
    }

    public static void main(String[] args)  {
        task1Solution();

    }
}