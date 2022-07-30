package edu.programacion.avanzada.aluismarte.ProyectoFinal.configuracion;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.map.repository.config.EnableMapRepositories;

@EnableMapRepositories
@Configuration
public class KeyValueConfiguration {

//    //To be used only if @EnableMapRepositories is not used.
//    //Else @EnableMapRepositories gives us a template as well.
//    @Bean("keyValueTemplate")
//    public KeyValueOperations keyValueTemplate() {
//        return new KeyValueTemplate(keyValueAdapter());
//    }
//
//    @Bean
//    public KeyValueAdapter keyValueAdapter() {
//        return new MapKeyValueAdapter(ConcurrentHashMap.class);
//    }
}
