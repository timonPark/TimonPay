package me.timonpay.membership.application.port.in;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import me.timonpay.common.SelfValidating;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class FindMembershipCommand extends SelfValidating<FindMembershipCommand> {
	private final String membershipId;
}
