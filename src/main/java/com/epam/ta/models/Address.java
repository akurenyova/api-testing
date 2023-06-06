package com.epam.ta.models;

public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    public Address() {}

    public Address(String street, String suite, String city, String zipcode, Geo geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    @Override
    public String toString() {
        return "Address{" +
               "street='" + street + '\'' +
               ", suite='" + suite + '\'' +
               ", city='" + city + '\'' +
               ", zipcode='" + zipcode + '\'' +
               ", geo=" + geo.toString() +
               '}';
    }

    class Geo {
        private double lat;
        private double lng;

        public Geo() {
        }

        public Geo(double lat, double lng) {
            this.lat = lat;
            this.lng = lng;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }

        @Override
        public String toString() {
            return "Geo{" +
                   "lat=" + lat +
                   ", lng=" + lng +
                   '}';
        }
    }
}

