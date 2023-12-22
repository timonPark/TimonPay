package me.timonpay.membership.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import me.timonpay.common.PersistenceAdapter;
import me.timonpay.membership.application.port.out.FindMembershipPort;
import me.timonpay.membership.domain.Membership;
import me.timonpay.membership.domain.Membership.MembershipId;

@RequiredArgsConstructor
@PersistenceAdapter
public class MembershipPersistenceAdapter implements FindMembershipPort {

	private final SpringDataMembershipRepository membershipRepository;
	private final MembershipMapper membershipMapper;

	@Override public Membership findMembership(final MembershipId membershipId) {
		return membershipMapper.mapToDomainEntity(membershipRepository.getById(Long.parseLong(membershipId.getMembershipId())));
	}
}
