/***
 * City.java
 * Entity for the City
 * @Author: Elvis Ndlangamandla (213063964)
 * Date: 15 June 2022
 */
package za.ac.cput.school_management.service.employeeService;

import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.domain.StudentAddress;
import za.ac.cput.school_management.service.IService;

import java.util.Optional;

public interface ICityService extends IService<City, String> {
    void deleteById(String id);

}
