package BuilderPattern.Assignment;

import java.util.Date;

public class Product {
    private final String travelName;
    private final Date startDate;
    private final Date endDate;
    private final String origin;
    private final String destination;
    private final String segment;
    private final int budget;

    //builder constructor

    private Product(Builder builder) {
        this.travelName = builder.travelName;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.origin = builder.origin;
        this.destination = builder.destination;
        this.segment = builder.segment;
        this.budget = builder.budget;
    }

    //nested Builder
    public static class Builder{
        private String travelName;
        private Date startDate;
        private Date endDate;
        private String origin;
        private String destination;

        private String segment;
        private int budget;

        //required fields
        public Builder(String travelName, Date startDate, Date endDate, String origin, String destination)  {
            this.travelName = travelName;
            this.startDate = startDate;
            this.endDate = endDate;
            this.origin = origin;
            this.destination = destination;
        }

        public Builder segment(String segment){
            this.segment = segment;
            return this;
        }

        public Builder budget(int budget){
            this.budget = budget;
            return this;
        }

        public Product build(){
            if(travelName == null || travelName.isBlank()){
                throw new IllegalArgumentException("travelName name cannot be empty");
            }
            if(startDate.after(endDate)){
                throw new IllegalArgumentException("startDate cannot be after endDate");
            }
            if(endDate.before(startDate)){
                throw new IllegalArgumentException("endDate cannot be before startDate");
            }
            if(origin == null || origin.isBlank()){
                throw new IllegalArgumentException("origin cannot be empty");
            }
            if(destination == null || destination.isBlank()){
                throw new IllegalArgumentException("destination cannot be empty");
            }
            return new Product(this);
        }
    }

    public void Display(){
        System.out.println("Travel Name: " + travelName);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);

        System.out.println("Segment: " + segment);
        System.out.println("Budget: " + budget);
    }
}
