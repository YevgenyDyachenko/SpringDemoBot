package io.proj3ct.SpringDemoBot.service;

import java.util.Random;

public class RandomCountry {
    private static final String[] COUNTRIES = {"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia (Plurinational State of)", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic (the)", "Chad", "Chile", "China", "Colombia", "Comoros (the)", "Congo (the Democratic Republic of the)", "Costa Rica", "Côte d'Ivoire", "Croatia", "Cuba", "Cyprus", "Czechia"};

    public String getRandomCountry() {
        Random random = new Random();
        int index = random.nextInt(COUNTRIES.length);
        return COUNTRIES[index];
    }
}