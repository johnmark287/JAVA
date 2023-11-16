public class University
{
    public static void main(String[] args)
    {
        Jkuat jkuat = new Jkuat();``
    }
}

class Jkuat
{
	protected String college;
    protected String openDate;
    protected String closeDate;

    // public abstract void open()
    // {
        
    // }
}

class College extends Jkuat
{
    protected String school;
    protected String departement;
    
    public void setCollege(String college)
    {
        this.college = college;
    }

    public String getCollege()
    {
        return college;
    }

    public void setSchool(String school)
    {
        this.school = school;
    }

    public String getSchool()
    {
        return school;
    }

    public void setDepartement(String departement)
    {
        this.departement = departement;
    }

    public String getDepartement()
    {
        return departement;
    }
}
