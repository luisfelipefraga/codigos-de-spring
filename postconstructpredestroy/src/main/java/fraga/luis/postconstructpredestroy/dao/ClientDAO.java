package fraga.luis.postconstructpredestroy.dao;

import fraga.luis.postconstructpredestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter @Setter

@Component
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstruct() {
        System.out.println("criou o objeto!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Fim do objeto!");
    }
}
