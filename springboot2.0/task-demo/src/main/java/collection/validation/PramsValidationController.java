package collection.validation;

import domain.Person;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PramsValidationController {

    @RequestMapping("/validation")
    public void validation(@Valid Person person, BindingResult result) {

        result.getAllErrors().stream().forEach(c -> System.out.println(c.getDefaultMessage()));

    }

    @RequestMapping("/validation2")
    public void validation(Person person) {

        System.out.println(person);


    }
}
