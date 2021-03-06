package com.c4po.template.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.c4po.template.db.table.DeviceEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DEVICE_ENTITY".
*/
public class DeviceEntityDao extends AbstractDao<DeviceEntity, Void> {

    public static final String TABLENAME = "DEVICE_ENTITY";

    /**
     * Properties of entity DeviceEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property DeviceId = new Property(0, String.class, "deviceId", false, "DEVICE_ID");
        public final static Property DeviceName = new Property(1, String.class, "deviceName", false, "DEVICE_NAME");
        public final static Property CommunityName = new Property(2, String.class, "communityName", false, "COMMUNITY_NAME");
        public final static Property BuildingNumber = new Property(3, String.class, "buildingNumber", false, "BUILDING_NUMBER");
        public final static Property ApartmentNumber = new Property(4, String.class, "apartmentNumber", false, "APARTMENT_NUMBER");
        public final static Property FaceSerialNumber = new Property(5, String.class, "faceSerialNumber", false, "FACE_SERIAL_NUMBER");
    }


    public DeviceEntityDao(DaoConfig config) {
        super(config);
    }
    
    public DeviceEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DEVICE_ENTITY\" (" + //
                "\"DEVICE_ID\" TEXT," + // 0: deviceId
                "\"DEVICE_NAME\" TEXT," + // 1: deviceName
                "\"COMMUNITY_NAME\" TEXT," + // 2: communityName
                "\"BUILDING_NUMBER\" TEXT," + // 3: buildingNumber
                "\"APARTMENT_NUMBER\" TEXT," + // 4: apartmentNumber
                "\"FACE_SERIAL_NUMBER\" TEXT);"); // 5: faceSerialNumber
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DEVICE_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DeviceEntity entity) {
        stmt.clearBindings();
 
        String deviceId = entity.getDeviceId();
        if (deviceId != null) {
            stmt.bindString(1, deviceId);
        }
 
        String deviceName = entity.getDeviceName();
        if (deviceName != null) {
            stmt.bindString(2, deviceName);
        }
 
        String communityName = entity.getCommunityName();
        if (communityName != null) {
            stmt.bindString(3, communityName);
        }
 
        String buildingNumber = entity.getBuildingNumber();
        if (buildingNumber != null) {
            stmt.bindString(4, buildingNumber);
        }
 
        String apartmentNumber = entity.getApartmentNumber();
        if (apartmentNumber != null) {
            stmt.bindString(5, apartmentNumber);
        }
 
        String faceSerialNumber = entity.getFaceSerialNumber();
        if (faceSerialNumber != null) {
            stmt.bindString(6, faceSerialNumber);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DeviceEntity entity) {
        stmt.clearBindings();
 
        String deviceId = entity.getDeviceId();
        if (deviceId != null) {
            stmt.bindString(1, deviceId);
        }
 
        String deviceName = entity.getDeviceName();
        if (deviceName != null) {
            stmt.bindString(2, deviceName);
        }
 
        String communityName = entity.getCommunityName();
        if (communityName != null) {
            stmt.bindString(3, communityName);
        }
 
        String buildingNumber = entity.getBuildingNumber();
        if (buildingNumber != null) {
            stmt.bindString(4, buildingNumber);
        }
 
        String apartmentNumber = entity.getApartmentNumber();
        if (apartmentNumber != null) {
            stmt.bindString(5, apartmentNumber);
        }
 
        String faceSerialNumber = entity.getFaceSerialNumber();
        if (faceSerialNumber != null) {
            stmt.bindString(6, faceSerialNumber);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public DeviceEntity readEntity(Cursor cursor, int offset) {
        DeviceEntity entity = new DeviceEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // deviceId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // deviceName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // communityName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // buildingNumber
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // apartmentNumber
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // faceSerialNumber
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DeviceEntity entity, int offset) {
        entity.setDeviceId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setDeviceName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCommunityName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setBuildingNumber(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setApartmentNumber(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setFaceSerialNumber(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(DeviceEntity entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(DeviceEntity entity) {
        return null;
    }

    @Override
    public boolean hasKey(DeviceEntity entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
