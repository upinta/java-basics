package builder.design.pattern;

public class TestBuilder {
    private int age;
    private String name;
    private String gender;

    private TestBuilder(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.gender = builder.gender;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    private static class Builder {
        private int age;
        private String name;
        private String gender;

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public TestBuilder build() {
            return new TestBuilder(this);
        }
    }
}
