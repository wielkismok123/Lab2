package Lab2;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date dateToEnd1 = new Date(System.currentTimeMillis() + 9873637);
        Date dateToEnd2 = new Date(System.currentTimeMillis() + 38392902);
        Date dateToEnd3 = new Date(System.currentTimeMillis() + 36437280);
        Task task1 = new Task("Jazda na rowerze", "jazda", taskCategory.IN_PPROGRES dateToEnd1.toString());
        Task task2 = new Task("Jazda samochodem", "citroen", taskCategory.DONE, dateToEnd2.toString());
        Task task3 = new Task("Karmienie kota", "Karma Whiskas", taskCategory.NEW, dateToEnd3.toString());
        Date dateToEnd4 = new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(90));
        Task task4 = new Task("Odkurzyc", "Odkurzac", taskCategory.NEW, dateToEnd4.toString());

        List<Task> taskList = new ArrayList<Task>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);

        for (Task task : taskList) {
            System.out.println(task.toString());
        }
    }




