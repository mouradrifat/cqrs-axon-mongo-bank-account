package com.craftmania.cqrsaxon;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CqrsAxonCraftmaniaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CqrsAxonCraftmaniaApplication.class, args);
    }

//    @Bean
//    public Repository<AccountAggregate> accountAggregateRepository(EntityManagerProvider emp, ParameterResolverFactory prf, EventBus eb){
//       return GenericJpaRepository.builder(AccountAggregate.class)
//               .entityManagerProvider(emp)
//               .parameterResolverFactory(prf)
//               .eventBus(eb)
//               .build();
//    }
//
//    @Bean
//    public EventSourcingRepository<AccountAggregate> eventSourcingRepository(EventStore eventStore,ParameterResolverFactory prf){
//        return EventSourcingRepository.builder(AccountAggregate.class)
//                .eventStore(eventStore)
//                .parameterResolverFactory(prf)
//                .build();
//    }
}
