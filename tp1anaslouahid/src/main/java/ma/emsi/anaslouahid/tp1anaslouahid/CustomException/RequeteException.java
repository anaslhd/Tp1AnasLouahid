package ma.emsi.anaslouahid.tp1anaslouahid.CustomException;


    public class RequeteException extends RuntimeException {
        private final String statusInfo;
        private final String formattedObject;


        public RequeteException(String statusInfo, String formattedObject) {
            super(statusInfo + " | Details: " + formattedObject); // Combine details for the message
            this.statusInfo = statusInfo;
            this.formattedObject = formattedObject;
        }


        public String getStatusInfo() {
            return statusInfo;
        }

        public String getFormattedObject() {
            return formattedObject;
        }



    }

