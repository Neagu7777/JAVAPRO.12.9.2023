package ConstructorPerson;

import java.util.Date;
import java.util.Objects;
import java.util.List;

/*У нас есть класс Person.
1)Сделать его правильным- создать геттеры и сеттеры, проверить, что он соответствует тем правилам, которые мы обсуждали.
2)Создать класс пенсионный фонд в нем создать такие поля:
а)Наименование пенсионного фонда .
б)булеан переменная, является ли он государственный
в)дата создания
г)количество участников фонда.
3)Добавить сеттеры и геттеры этому классу, заблокируют прямой доступ к переменным.
4)Добавить метод "info"- выводить информацию по фонду. Если фонд государственный, то информация должна содержать строку о том, сколько тысячи человек использует фонд. Для негосударственного фонда сколько не тысяч человек использует фонд.
5)Запретите менять дату создания фонда(отобрать сеттер).

 */
public class PensionFund {
    private String fundName;
    private boolean isGovernmental;
    private Date creationDate;
    private int participantCount;
    private List<AbleToCalculatePension> peopleList;


    public PensionFund(String fundName, boolean isGovernmental, Date creationDate, int participantCount) {

        this.fundName = fundName;
        this.creationDate = creationDate;
        this.participantCount = participantCount;
        this.isGovernmental = isGovernmental;
    }


    public String getFundName() {
        return fundName;

    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public boolean isGovernmental() {
        return isGovernmental;

    }

    public void setGovernmental(boolean governmental) {
        isGovernmental = governmental;

    }

    public Date getCreationDate() {

        return creationDate;
    }

    // Запрещаем изменение даты создания фонда
//    public void setCreationDate(Date creationDate) {
//        this.creationDate = creationDate;

//    }

    public int getParticipantCount() {
        return participantCount;

    }

    public void setParticipantCount(int participantCount) {
        this.participantCount = participantCount;

    }

    public List<AbleToCalculatePension> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<AbleToCalculatePension> peopleList) {
        this.peopleList = peopleList;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PensionFund that = (PensionFund) obj;
        return isGovernmental == that.isGovernmental && participantCount == that.participantCount && Objects.equals(fundName, that.fundName) && Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundName, isGovernmental, creationDate, participantCount);
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + fundName + '\'' +
                ", isState=" + isGovernmental +
                ", dateOfCreation='" + creationDate + '\'' +
                ", countOfPersons=" + participantCount +
                '}';
    }

    public void info() {
        if (isGovernmental) {
            System.out.println("Государственный фонд, используется " + participantCount / 1000 + " тысяч человек.");
        } else {
            System.out.println("Негосударственный фонд, используется " + participantCount + " не тысяч человек.");
        }
    }

    public double calculatePensionFor(AbleToCalculatePension obj) {
        if (isGovernmental) {
            return obj.calculatePension();
        } else {
            return 0; // Деньги из фонда украли
        }
    }

    public double calculateMedianPension() {
        double totalPensions = 0.0;
        int numPeople = peopleList.size();

        if (numPeople == 0) {
            return 0.0; // Вернуть 0, если список пустой
        }

        for (AbleToCalculatePension person : peopleList) {
            totalPensions += person.calculatePension();
        }

        return totalPensions / numPeople;
    }
}
/*


    В этом коде мы удалили поле "количество вкладчиков" и заменили его на вызов peopleList.size() для определения количества вкладчиков.
        Метод calculateMedianPension() теперь пройдет по всем элементам списка из людей и для каждого вызовет метод расчета пенсии.
        Затем он вычислит среднее значение пенсии для всех вкладчиков и вернет это значение.

*/