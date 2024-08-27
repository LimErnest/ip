import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
public class Events extends Task {
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    public Events(String description, String start, String end) throws DateTimeParseException {
        super(description);
        this.startDate = LocalDateTime.parse(start, INPUT_FORMATTER);
        this.endDate = LocalDateTime.parse(end, INPUT_FORMATTER);
    }

    /**
     * Returns the Event as a string with its status, description, start time and end time
     *
     * @return a String of the Event
     */
    @Override
    public String toString() {
        return "[E]" + super.toString() + " (from: " + this.startDate.format(OUTPUT_FORMATTER) +
                " to: " + this.endDate.format(OUTPUT_FORMATTER) + ")";
    }

    /**
     * Returns Event as a fancier string with its status, description, start time and end time
     * Meant for recording in text files
     *
     * @return Fancier string of the Deadline
     */
    @Override
    public String toFancyString() {
        return "Event | " + super.getStatus() + " | " + super.getDescription() +
                " | /from "  + super.reverseLocalDateTimeParse(this.startDate) +
                " /to " + super.reverseLocalDateTimeParse(this.endDate);
    }
}
