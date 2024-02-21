package com.example.shadowfighthandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.shadowfighthandbook.adapter.CategoryAdapter;
import com.example.shadowfighthandbook.adapter.EquipAdapter;
import com.example.shadowfighthandbook.model.Category;
import com.example.shadowfighthandbook.model.Equips;

import java.util.ArrayList;
import java.util.List;

public class EquipmentList extends AppCompatActivity {

    RecyclerView categoryRecycler, equipmentRecycler;
    CategoryAdapter categoryAdapter;
    static EquipAdapter equipAdapter;
    static List<Equips> equipsList = new ArrayList<>();
    static List<Equips> fullEquipsList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment_list);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Обычн."));
        categoryList.add(new Category(2, "Редк."));
        categoryList.add(new Category(3, "Эпич."));
        categoryList.add(new Category(4, "Легенд."));

        setCategoryRecycler(categoryList);


        equipsList.add(new Equips(1, "arbiter", "Священный судья", "Вестники", "Глава 3", "#FFC90A", "Сет Судей Купола, вершащих приговоры Пустой комнаты.", 4));
        equipsList.add(new Equips(2, "artisan", "Творец теней", "Вестники", "Глава 5", "#FFC90A", "Сет созданный по образу и подобию одежды мастера Окады - гениального изобретателя.", 4));
        equipsList.add(new Equips(3, "student", "Ученик", "Династия", "Глава 2", "#A0A0A0", "Стандартный комплект одежды учеников школ боевых искусств Династии.", 1));
        equipsList.add(new Equips(4, "swamper", "Болотник", "Легион", "Глава 1", "#FF8A00", "Коплект камуфляжных доспехов, которые носили рыцари сгинувшие на проклятых болотах.", 3));
        equipsList.add(new Equips(5, "voidwarden", "Страж Бездны", "Вестники", "Глава 7: часть 2", "#FFC90A", "Кибер-броня, какую носят Стражи Бездны - плоды экспериментов Легиона.", 4));
        equipsList.add(new Equips(6, "feldsher", "Фельдшер", "Вестники", "Глава 3", "#FF8A00", "Защитня форма подразделения Фельдшеров - особого отряда Вестников, специальизирующегося на устранении теневых аварий", 3));

        fullEquipsList.addAll(equipsList);
        setEquipRecycler(equipsList);


    }

    private void setEquipRecycler(List<Equips> equipsList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        equipmentRecycler = findViewById(R.id.equipmentRecycler);
        equipmentRecycler.setLayoutManager(layoutManager);

        equipAdapter = new EquipAdapter(this, equipsList);
        equipmentRecycler.setAdapter(equipAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }

    public static void showEquipByCategory (int category){

        equipsList.clear();
        equipsList.addAll(fullEquipsList);
        List<Equips> filterEquips = new ArrayList<>();
        for (Equips e : equipsList){
            if(e.getCategory() == category) {
                filterEquips.add(e);
            }
        }

        equipsList.clear();
        equipsList.addAll(filterEquips);

        equipAdapter.notifyDataSetChanged();

    }
}