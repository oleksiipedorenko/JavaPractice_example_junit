package ua.skillsup.practice;

import java.time.LocalDate;
import java.util.Objects;

public class ExampleEntity {

	private final long id;
	private final String name;
	private final LocalDate dateBirth;

	public ExampleEntity(long id, String name, LocalDate dateBirth) {
		this.id = id;
		this.name = name;
		this.dateBirth = dateBirth;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDateBirth() {
		return dateBirth;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ExampleEntity that = (ExampleEntity) o;
		return id == that.id &&
				Objects.equals(name, that.name) &&
				Objects.equals(dateBirth, that.dateBirth);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, dateBirth);
	}

	@Override
	public String toString() {
		return "ExampleEntity{" +
				"id=" + id +
				", name='" + name + '\'' +
				", dateBirth=" + dateBirth +
				'}';
	}
}