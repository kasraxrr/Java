import java.util.ArrayList;

public class GradeList
{
    private ArrayList<Grade> grades;

    public GradeList()
    {
        this.grades = new ArrayList<>();
    }

    public int size()
    {
        return grades.size();
    }

    public void addGrade(Grade grade)
    {
        grades.add(grade);
    }

    public void addGrade(int index, Grade grade)
    {
        grades.add(index, grade);
    }

    public void removeGrade(int index)
    {
        grades.remove(index);
    }

    public Grade getGrade(int index)
    {
        return grades.get(index);
    }

    public Grade getMaxGrade()
    {
        int maxGrade = -3;
        Grade maxGradeObject = null;
        for (int i = 0; i < grades.size(); i++)
        {
            if (grades.get(i).getGrade() > maxGrade)
            {
                maxGrade = grades.get(i).getGrade();
                maxGradeObject = grades.get(i);
            }
        }

        return maxGradeObject;
    }

    public Grade getMinGrade()
    {
        int minGrade = 12;
        Grade minGradeObject = null;
        for (int i = 0; i < grades.size(); i++)
        {
            if (grades.get(i).getGrade() < minGrade)
            {
                minGrade = grades.get(i).getGrade();
                minGradeObject = grades.get(i);
            }
        }

        return minGradeObject;
    }

    public double getAverage()
    {
        double sum = 0;
        for (int i = 0; i < grades.size(); i++)
        {
            sum += grades.get(i).getGrade();
        }
        return sum / grades.size();
    }

    public int getGradeCount(int grade)
    {
        int occurrences = 0;
        for (int i = 0; i < grades.size(); i++)
        {
            if (grades.get(i).getGrade() == grade)
            {
                occurrences++;
            }
        }
        return occurrences;
    }

    public String getGradeDistribution()
    {
        String returnString = "";
        for (int i = 0; i < Grade.LEGAL_GRADES.length; i++)
        {
            int count = 0;
            for (int chari = 0; chari < grades.size(); chari++)
            {
                if (grades.get(chari).getGrade() == Grade.LEGAL_GRADES[i])
                {
                    count++;
                }
            }
            returnString = returnString + "\n" + Grade.LEGAL_GRADES[i] + ": " + count;
        }
        return returnString;
    }

    @Override public String toString()
    {
        return grades.toString();
    }

    @Override public boolean equals(Object obj)
    {
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        GradeList other = (GradeList) obj;
        if (size() == other.size())
        {
            boolean isTheSame = true;
            for (int i = 0; i < size(); i++)
            {
                if (!grades.get(i).equals(other.grades.get(i)))
                {
                    isTheSame = false;
                    break;
                }
            }
            return isTheSame;
        }
        else
        {
            return false;
        }
    }
}
