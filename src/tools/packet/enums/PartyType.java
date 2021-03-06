package tools.packet.enums;

public enum PartyType {
    PARTY_INVITE(4),
    REQUEST_INVITE(8),
    UPDATE(16),
    CREATE(17),
    ALREADY_JOINED_PARTY(18),
    BEGINNER_CANT_CREATE_PARTY(19),
    LEAVE(22),
    YET_TO_JOIN_PARTY(23),
    JOIN(25),
    ALREADY_JOINED_PARTY_2(27),
    PARTY_FULL_ERROR(28),
    INVITE_MESSAGE(34),
    PARTY_REQUEST_DECLINE(38),
    PARTY_REQUEST_ACCEPT(39),
    INVITE_MESSAGE_2(40),
    CANNOT_KICK_IN_THIS_MAP(47),
    KICK_FUNCTION_UNAVAILABLE(49),
    MUST_BE_WITHIN_VICINITY_ERROR(51),
    NO_MEMBER_IN_VICINITY_FOR_LEADERSHIP_ERROR(52),
    CHANGE_WITH_PARTY_MEMBER_SAME_CHANNEL_ERROR(53),
    GM_CANT_CREATE_PARTY_ERROR(55),
    CANNOT_JOIN_PARTY_IN_DIFFERENT_WORLD(57),
    UNABLE_TO_FIND_CHAR_IN_CHANNEL(58),
    CANNOT_BE_DONE_IN_THIS_MAP(69);


    private int value;
    PartyType(int val){
        this.value = val;
    }

    public int getValue() {
        return value;
    }
}
