class CheckPersonGender implements CheckPerson{
    public boolean test(Person p) {
        return p.getGender() == Person.Sex.MALE;
    }
}
