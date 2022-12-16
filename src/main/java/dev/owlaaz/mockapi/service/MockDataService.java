package dev.owlaaz.mockapi.service;

import com.github.javafaker.Faker;
import dev.owlaaz.mockapi.dto.DataV1;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MockDataService {

    public List<DataV1> getData(int n) {
        List<DataV1> list = new ArrayList<>();
        Faker faker = new Faker();
        for (int i = 0; i < n; i++) {
            list.add(generateMockData(faker));
        }
        return list;
    }

    private DataV1 generateMockData(Faker faker) {
        DataV1 data = new DataV1();
        data.setId(faker.idNumber().valid());
        data.setTitle(faker.name().title());
        data.setFirstname(faker.name().firstName());
        data.setLastname(faker.name().lastName());
        data.setGroup(faker.color().name());
        return data;
    }
}
