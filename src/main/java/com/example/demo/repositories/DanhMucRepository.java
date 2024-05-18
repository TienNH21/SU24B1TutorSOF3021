package com.example.demo.repositories;

import com.example.demo.entities.DanhMuc;

import java.util.ArrayList;
import java.util.List;

public class DanhMucRepository {
    private List<DanhMuc> ds;

    public DanhMucRepository()
    {
        this.ds = new ArrayList<>();
        this.ds.add(new DanhMuc(1, "PH1", "Ao the thao"));
        this.ds.add(new DanhMuc(2, "PH2", "Ao Nam"));
        this.ds.add(new DanhMuc(3, "PH3", "Ao Nu"));
    }

    public List<DanhMuc> findAll()
    {
        return this.ds;
    }

    public void insert(DanhMuc danhMuc)
    {
        this.ds.add(danhMuc);
    }

    public void update(DanhMuc danhMuc)
    {
        for (int viTri = 0; viTri < this.ds.size(); viTri++) {
            DanhMuc ptuDangDuyet = this.ds.get(viTri);
            if (ptuDangDuyet.getId() == danhMuc.getId()) {
                this.ds.set(viTri, danhMuc);
            }
        }
    }

    public void deleteById(int id)
    {
        for (int viTri = 0; viTri < this.ds.size(); viTri++) {
            DanhMuc ptuDangDuyet = this.ds.get(viTri);
            if (ptuDangDuyet.getId() == id) {
                this.ds.remove(viTri);
            }
        }
    }
}
