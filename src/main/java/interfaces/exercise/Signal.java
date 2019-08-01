package interfaces.exercise;

import java.util.Objects;

public class Signal
{

    private final String deviceId;
    private final String providerId;
    private final Long timestamp;

    private Signal(
        final String deviceId,
        final String providerId,
        final Long timestamp )
    {
        this.deviceId = deviceId;
        this.providerId = providerId;
        this.timestamp = timestamp;
    }

    public static Signal of(
        final String deviceId,
        final String providerId,
        final Long timestamp )
    {
        return new Signal( deviceId, providerId, timestamp );
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public String getProviderId()
    {
        return providerId;
    }

    public Long getTimestamp()
    {
        return timestamp;
    }

    @Override
    public boolean equals(
        final Object obj )
    {
        if( this == obj ) {
            return true;
        }
        if( ! ( obj instanceof Signal ) ) {
            return false;
        }
        final Signal that = (Signal) obj;
        return Objects.equals( getDeviceId(), that.getDeviceId() ) && Objects.equals( getProviderId(), that.getProviderId() ) && Objects
            .equals( getTimestamp(), that.getTimestamp() );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( getDeviceId(), getProviderId(), getTimestamp() );
    }

}
