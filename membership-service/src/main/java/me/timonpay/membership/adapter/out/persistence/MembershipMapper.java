package me.timonpay.membership.adapter.out.persistence;

import me.timonpay.membership.domain.Membership;
import me.timonpay.membership.domain.Membership.MembershipAdderess;
import me.timonpay.membership.domain.Membership.MembershipAggregateIdentifier;
import me.timonpay.membership.domain.Membership.MembershipEmail;
import me.timonpay.membership.domain.Membership.MembershipId;


import me.timonpay.membership.domain.Membership.MembershipIsValid;
import me.timonpay.membership.domain.Membership.MembershipName;
import org.springframework.stereotype.Component;

@Component
public class MembershipMapper {
	Membership mapToDomainEntity(
			MembershipJpaEntity membership
  ) {
		return Membership.generateMember(
				new MembershipId(membership.getMembershipId()+""),
				new MembershipName(membership.getName()),
				new MembershipEmail(membership.getEmail()),
				new MembershipAdderess(membership.getAddress()),
				new MembershipIsValid(membership.isValid()),
				new MembershipAggregateIdentifier(membership.getAggregateIdentifier())
		);
	}

}
