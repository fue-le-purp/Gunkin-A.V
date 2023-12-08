import java.util.Date;

// Класс для событий
class Event extends AbstractTask {
    private Date dateTime;

    public Event(String name, String description, Date dateTime) {
        super(name, description);
        this.dateTime = dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Date getDateTime() {
        return dateTime;
    }
}
