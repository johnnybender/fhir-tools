package org.sitenv.spring.service;

import org.sitenv.spring.model.DafMedicationDispense;

import java.util.List;

public interface MedicationDispenseService {

    public List<DafMedicationDispense> getAllMedicationDispense();

    public DafMedicationDispense getMedicationDispenseResourceById(int id);

    public List<DafMedicationDispense> getMedicationDispenseByPatient(String patient);

    public List<DafMedicationDispense> getMedicationDispenseByCode(String code);

    public List<DafMedicationDispense> getMedicationDispenseByIdentifier(String identifierSystem, String identifierValue);

    public List<DafMedicationDispense> getMedicationDispenseByMedication(String medication);

    public List<DafMedicationDispense> getMedicationDispenseByStatus(String status);

}
