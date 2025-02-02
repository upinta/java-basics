package builder.design.pattern;

public class StudentTest {
    private int id;
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String email;
    private String phoneNumber;

    private StudentTest(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.psp = builder.psp;
        this.universityName = builder.universityName;
        this.email = builder.getEmail();
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder getBuilder() {
        return new Builder();
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public static class Builder {
        private int id;
        private String name;
        private int age;
        private double psp;
        private String universityName;
        private String email;
        private String phoneNumber;

        public int getId() {
            return id;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public StudentTest build() {
            if (this.getAge() < 25) {
                throw new RuntimeException("Validation failed!!");
            }
            return new StudentTest(this);
        }
    }

}

