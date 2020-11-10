/**
 * @author Rohtash Lakra (rslakra.work@gmail.com)
 * @version 1.0.0* @created Nov 09, 2020 21:38:19
 * @since 1.0.0
 */
class Email {
    String name
    String email
    Date sentDate
    String notes

    String showDetails() {
        return "Name: $name \nEmail: $email \nSent Date: $sentDate \nNotes: $notes"
    }
}
