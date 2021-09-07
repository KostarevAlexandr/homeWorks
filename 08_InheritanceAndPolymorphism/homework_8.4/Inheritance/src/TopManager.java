public class TopManager implements Employee {


    private final int fixedPart = 30000;
    private Company company ;

    public TopManager(Company company){
        this.company =company;
    }

    @Override
    public int getMonthSalary() {
        if (company.getIncome() >= 10000000){
            return (int) (fixedPart * 1.5);}
        return fixedPart;

    }
}
