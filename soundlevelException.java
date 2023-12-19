public class soundlevelException extends Exception{
    private Sounds sounds;
    private String message;

    public soundlevelException(Sounds sounds, String message) {
        super(sounds + message);
        this.sounds = sounds;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return sounds + " " + message;
    }

}
