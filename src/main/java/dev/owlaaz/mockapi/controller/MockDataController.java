package dev.owlaaz.mockapi.controller;

import dev.owlaaz.mockapi.dto.DataV1;
import dev.owlaaz.mockapi.service.MockDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/mock-data")
@RestController
public class MockDataController {
    final
    MockDataService mockDataService;

    public MockDataController(MockDataService mockDataService) {
        this.mockDataService = mockDataService;
    }

    @GetMapping("")
    List<DataV1> getMockData(@RequestParam(value = "size", defaultValue = "100") int size) {
        return mockDataService.getData(size);

    }
}
