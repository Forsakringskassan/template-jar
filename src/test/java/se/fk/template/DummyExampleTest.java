package se.fk.template;

import org.junit.jupiter.api.Test;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest
{

   @Test
   void thingsShouldDoStuff()
   {
      Person person = ImmutablePerson.builder()
            .name("John")
            .age(42)
            .build();

      Gson gson = new Gson().newBuilder().setPrettyPrinting().create();

      String json = gson.toJson(person);

      assertThat(json).isEqualToIgnoringWhitespace("""
            {
              "name": "John",
              "age": 42
            }
            """);
   }

}
