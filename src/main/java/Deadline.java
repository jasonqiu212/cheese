public class Deadline extends Task {
  /** Deadline of deadline */
  private String deadline;

  /**
   * Constructor to create a new Deadline
   * 
   * @param description description of Deadline
   * @param deadline    deadline of Deadline
   */
  public Deadline(String description, String deadline) {
    super(description);
    this.deadline = deadline;
  }

  public Deadline(boolean isDone, String description, String deadline) {
    super(isDone, description);
    this.deadline = deadline;
  }

  /**
   * Returns string representation of Deadline
   * 
   * @return string representation of Deadline
   */
  @Override
  public String toString() {
    return "[D]" + super.toString() + " (by: " + this.deadline + ")";
  }
}
