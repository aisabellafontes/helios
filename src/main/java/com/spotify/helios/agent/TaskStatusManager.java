package com.spotify.helios.agent;

import com.spotify.helios.common.descriptors.PortMapping;
import com.spotify.helios.common.descriptors.TaskStatus.State;

import java.util.Map;

public interface TaskStatusManager {

  void setStatus(State status, boolean isFlapping, String containerId,
                 Map<String, PortMapping> ports, Map<String, String> env);

  void updateFlappingState(boolean isFlapping);

  State getStatus();

  boolean isFlapping();
}
