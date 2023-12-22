package me.timonpay.membership.adapter.out.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MEMBERSHIP")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MembershipJpaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MEMBERSHIP_ID")
	private Long membershipId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "IS_VALID")
	private boolean isValid;

	@Column(name = "AGGREGATE_IDENTIFIER")
	private String aggregateIdentifier;

	public MembershipJpaEntity(String name, String address, String email, boolean isValid, String aggregateIdentifier) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.isValid = isValid;
		this.aggregateIdentifier = aggregateIdentifier;
	}

	@Override
	public String toString() {
		return "MembershipJpaEntity{" +
				"membershipId=" + membershipId +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", email='" + email + '\'' +
				", isValid=" + isValid +
				", aggregateIdentifier='" + aggregateIdentifier + '\'' +
				'}';
	}

}
