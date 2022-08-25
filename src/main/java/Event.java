import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event extends Task {
  /** Time interval of Event */
  private LocalDateTime timeInterval;

  /**
   * Constructor to create a new Event
   * 
   * @param description  description of Event
   * @param timeInterval time interval of Event
   */
  public Event(String description, String timeInterval) {
    super(description);
    String inputPattern = "yyyy-dd-MM HH:mm";
    DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern(inputPattern);
    this.timeInterval = LocalDateTime.parse(timeInterval, inputFormatter);
  }

  /**
   * Returns string representation of Event
   * 
   * @return string representation of Event
   */
  @Override
  public String toString() {
    String outputPattern = "dd-MM-yyyy HH:mm";
    DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern(outputPattern);
    return "[E]" + super.toString() + " (at: " + outputFormatter.format(timeInterval) + ")";
  }
}
