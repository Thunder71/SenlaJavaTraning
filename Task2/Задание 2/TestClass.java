import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;

public class TestClass {
    public static void main(String[] args) throws ParseException {

        Patient firstPatient = new Patient("Ivan", "Ivanov", 100100, 5501, 4890);
        firstPatient.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1990-05-20"));
        MedCard firstPatMedCard = new MedCard(10, "FirstPatient");

        firstPatient.setCard(firstPatMedCard);

        Diagnostic dig1 = new Diagnostic(1, "Cor");
        Diagnostic dig2 = new Diagnostic(2, "Bronchitis");
        Diagnostic dig3 = new Diagnostic(3, "Flu");
        Diagnostic dig4 = new Diagnostic(4, "Arthritis");

        Doctor doc1 = new Doctor("Igor", "Losev", "Therapist");
        Doctor doc2 = new Doctor("Anton", "Babaev", "Surgeon");

        Department firstDepartment = new Department(1, "FirstDepartment");

        firstDepartment.addDoctor(doc1);

        doc2.setDepartment(firstDepartment);

        firstPatient.setDiagnostic(dig1);
        firstPatient.setDiagnostic(dig4);

        Labaratory lab1 = new Labaratory(1, "FirstLab", "st.Octyabrskaya", "4040404");

        Analysis analysis1 = new Analysis(1, "First", "bioChem");
        Analysis analysis2 = new Analysis(2, "Second", "general_Clinical");
        Analysis analysis3 = new Analysis(3, "Third", "bacteriological");

        analysis1.setLab(lab1);
        analysis2.setLab(lab1);
        analysis3.setLab(lab1);

        Med_history num1 = new Med_history(new SimpleDateFormat("yyyy-MM-dd").parse("2005-05-10"));
        num1.setDiagnostics(dig2);
        num1.setAnalysis(analysis1);
        num1.setAnalysis(analysis2);
        num1.setStatus("healthy");
        num1.setDoc(doc1);
        Med_history num2 = new Med_history(new SimpleDateFormat("yyyy-MM-dd").parse("2010-11-15"));
        num2.setDiagnostics(dig3);
        num2.setDiagnostics(dig4);
        num2.setAnalysis(analysis1);
        num2.setAnalysis(analysis3);
        num2.setStatus("healthy");
        num2.setDoc(doc2);
        Med_history num3 = new Med_history(new SimpleDateFormat("yyyy-MM-dd").parse("2017-01-21"));
        num3.setDiagnostics(dig1);
        num3.setAnalysis(analysis1);
        num3.setAnalysis(analysis2);
        num3.setAnalysis(analysis3);
        num3.setStatus("healthy");
        num3.setDoc(doc1);

        firstPatMedCard.setMed_History(num1);
        firstPatMedCard.setMed_History(num2);
        firstPatMedCard.setMed_History(num3);

        System.out.println("Имя пациента: " + firstPatient.getName() +
                "\n" + "Фамилия пациента: " + firstPatient.getSurname() +
                "\n" + "Дата рождения" + firstPatient.getBirthday() +
                "\n" + "СНИЛС" + firstPatient.getSnils() +
                "\n" + "Серия паспорта: " + firstPatient.getSeriesPass() +
                "\n" + "Номер паспорта: " + firstPatient.getNumPass() +
                "\n" + "Заболел: ");
        Iterator iter = firstPatient.getDiagnostics().iterator();
        while (iter.hasNext()){
            System.out.println(((Diagnostic) iter.next()).getName() + ";");
        }

        System.out.println("Мед. карта: " + firstPatient.getCard().getName() + "\n");

        System.out.println("История заболевания : " + "\n");
        Iterator iter1 = firstPatMedCard.getMed_History().iterator();
        while (iter1.hasNext()){
            System.out.println(((Med_history) iter1.next()).toString());
        }

    }
}