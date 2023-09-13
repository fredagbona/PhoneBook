public enum PhoneNumberCategory {
    MOBILE,
    OFFICE,
    HOME;
    public static PhoneNumberCategory getMobileNumberCategory(String phoneNumberType) throws Exception {
        for (PhoneNumberCategory category : PhoneNumberCategory.values()) {
            if (category.name().equals(phoneNumberType)) {
                return category;
            }
        }
        throw new Exception("No such category: " + phoneNumberType);

    }

}
