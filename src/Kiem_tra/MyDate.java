package Kiem_tra;

public class MyDate {
    private  int year;
    private int month;
    private int day;
    public String MONTH [] = {"Jan","Feb","Mar", "Apr", "May", "Jun",
                    "Jul", "Aug", "Sep", "Oct" , "Nov", "Dec"};
    public String DAYS [] = {"Sunday", "Monday", "Tuesday", "Wednesday",
                    "Thursday","Friday", "Saturday"};
    public int DAYS_IN_MONTHS [] = {31,28,31,30,31,30,31,31,30,31,30,31};

    public MyDate() {
        year = month = day = 0;
    }

    boolean isLeapYear(int year)
    {
        if (year % 400 == 0)
            return true;
        if (year % 4 == 0 && year % 100 != 0)
            return true;
        return  false;
    }

    public boolean isValidDate(int year , int moth , int day)
    {
        if(isLeapYear(year) && moth == 2&& day >0 &&day <=29) return true;
        if(year >0 && day>0 && day<=31 && moth>0 && moth<=12)
        {
            if(day<=DAYS_IN_MONTHS[moth-1]) return true;
        }
        return  false;
    }

    int getDayOfWeek(int d, int m, int y) {
        int C = y / 100;
        int Y = y % 100;
        int m_prime = (m + 9) % 12 + 1;
        int K = d;
        int J = C / 4 - 2 * C + Y + Y / 4 + 13 * (m_prime + 1) / 5;
        int dayOfWeek = (K + J) % 7;
        return dayOfWeek;

        /*
            sử dụng công thức Zeller's Congruenced để tính toán thứ trong tuần;
            C là thế kỷ của năm.
            Y là số năm sau thế kỷ.
            m_prime là tháng m dịch chuyển để tính toán theo công thức (vì tháng 1 và 2 được tính là tháng 13 và 14 của năm trước đó).
            K là ngày.
            J được tính bằng công thức, sau đó được làm tròn về số nguyên gần nhất.
            dayOfWeek là kết quả trả về, là số nguyên từ 0 đến 6 tương ứng với thứ từ Chủ Nhật đến Thứ Bảy.
        */
    }

    public MyDate(int year, int moth, int day) {
        this.year = year;
        this.month = moth;
        this.day = day;
    }
    public void setDate(int year, int moth, int day)
    {
        this.year = year;
        this.month = moth;

        this.day = day;
    }
    public int getYear() {
        return year;
    }

    public int getMoth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMoth(int moth) {
        this.month = moth;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s %d",DAYS[getDayOfWeek(year,month,day)], day, MONTH[month-1], year);
    }

    public MyDate nextDay()
    {
        if(isLeapYear(year)){
            DAYS_IN_MONTHS[1] = 29;
        }
        if(day == DAYS_IN_MONTHS[month-1])
        {
            day = 1;
            if(month == 12){
                month = 1;
                year++;
            }
            else month++;
        }
        else  day++;
        return new MyDate(day,month,year);
    }

    public MyDate nextMonth()
    {
        month++;
        if(month==13)
        {
            month = 1;
            year++;
        }
        return new MyDate(day,month,year);
    }

    public MyDate nextYear()
    {
        year++;
        return new MyDate(day,month,year);
    }

    public MyDate previousDay()
    {
        day--;
        if(day<1)
        {
            month--;
            if(month<1){
                year--;
                month = 12;
            }
            if(isLeapYear(year)&& month == 2) DAYS_IN_MONTHS[1]= 29;
            day = DAYS_IN_MONTHS[month-1];
        }
        return new MyDate(day,month,year);
    }
    public MyDate previousMonth()
    {
        month--;
        if(month<1){
            year--;
            month=12;
        }
        return new MyDate(day,month,year);
    }
    public MyDate previousYear()
    {
        year--;
        return new MyDate(day,month,year);
    }
    

}
