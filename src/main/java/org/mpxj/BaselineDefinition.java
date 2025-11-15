/*
 * file:       BaselineDefinition.java
 * author:     BuiltPath
 * copyright:  (c) BuiltPath 2024
 * date:       14/11/2025
 */

/*
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */

package org.mpxj;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Metadata describing a baseline entry as defined by Asta Powerproject.
 */
public final class BaselineDefinition implements Serializable
{
   private static final long serialVersionUID = 1L;

   public BaselineDefinition(int slotIndex, Integer baselineId, Integer recordId, Integer baselineProjectId, Integer dataSourceId, String name, String description, String pathname, LocalDateTime createdDate, LocalDateTime updatedDate, boolean active, boolean deleted, boolean current, boolean imported, Integer revertingToBaselineId, String guid)
   {
      m_slotIndex = slotIndex;
      m_baselineId = baselineId;
      m_recordId = recordId;
      m_baselineProjectId = baselineProjectId;
      m_dataSourceId = dataSourceId;
      m_name = name;
      m_description = description;
      m_pathname = pathname;
      m_createdDate = createdDate;
      m_updatedDate = updatedDate;
      m_active = active;
      m_deleted = deleted;
      m_current = current;
      m_imported = imported;
      m_revertingToBaselineId = revertingToBaselineId;
      m_guid = guid;
   }

   public int getSlotIndex()
   {
      return m_slotIndex;
   }

   public Integer getBaselineId()
   {
      return m_baselineId;
   }

   public Integer getRecordId()
   {
      return m_recordId;
   }

   public Integer getBaselineProjectId()
   {
      return m_baselineProjectId;
   }

   public Integer getDataSourceId()
   {
      return m_dataSourceId;
   }

   public String getName()
   {
      return m_name;
   }

   public String getDescription()
   {
      return m_description;
   }

   public String getPathname()
   {
      return m_pathname;
   }

   public LocalDateTime getCreatedDate()
   {
      return m_createdDate;
   }

   public LocalDateTime getUpdatedDate()
   {
      return m_updatedDate;
   }

   public boolean isActive()
   {
      return m_active;
   }

   public boolean isDeleted()
   {
      return m_deleted;
   }

   public boolean isCurrent()
   {
      return m_current;
   }

   public boolean isImported()
   {
      return m_imported;
   }

   public Integer getRevertingToBaselineId()
   {
      return m_revertingToBaselineId;
   }

   public String getGuid()
   {
      return m_guid;
   }

   private final int m_slotIndex;
   private final Integer m_baselineId;
   private final Integer m_recordId;
   private final Integer m_baselineProjectId;
   private final Integer m_dataSourceId;
   private final String m_name;
   private final String m_description;
   private final String m_pathname;
   private final LocalDateTime m_createdDate;
   private final LocalDateTime m_updatedDate;
   private final boolean m_active;
   private final boolean m_deleted;
   private final boolean m_current;
   private final boolean m_imported;
   private final Integer m_revertingToBaselineId;
   private final String m_guid;
}
