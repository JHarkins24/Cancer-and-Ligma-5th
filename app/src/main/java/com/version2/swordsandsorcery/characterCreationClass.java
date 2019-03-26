package com.version2.swordsandsorcery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class characterCreationClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_creation_class);

        final Button Overview = findViewById(R.id.button8);
        Overview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(characterCreationClass.this,characterCreationOverview.class));
            }
        });
        final Button Class = findViewById(R.id.button5);
        Class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(characterCreationClass.this,characterCreationClass.class));
            }
        });
        final Button abilityScores = findViewById(R.id.button10);
        abilityScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(characterCreationClass.this,characterCreationAbilityScores.class));
            }
        });
        final Button Race = findViewById(R.id.button11);
        Race.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(characterCreationClass.this,characterCreationRace.class));
            }
        });
        final Button Background = findViewById(R.id.button12);
        Background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(characterCreationClass.this,characterCreationBackground.class));
            }
        });
        final Button Items = findViewById(R.id.button13);
        Items.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(characterCreationClass.this,characterCreationItems.class));
            }
        });
        final Button Spells = findViewById(R.id.button14);
        Spells.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(characterCreationClass.this,characterCreationSpells.class));
            }
        });
        final Button characterView = findViewById(R.id.button15);
        characterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(characterCreationClass.this,characterCreationCharacterView.class));
            }
        });
        ImageButton homeButton = findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(characterCreationClass.this, main_menu.class));
            }
        });

        Spinner artificer = findViewById(R.id.artificer);
        String[] artificerOptions = new String[]{"Alchemist", "Gunsmith"};
        ArrayAdapter<String> artificerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, artificerOptions);
        artificer.setAdapter(artificerAdapter);

        artificer.setOnItemSelectedListener(new OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                    {
                        Log.v("artificerSelect", (String) parent.getItemAtPosition(position));
                    }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                    {
                        // supposedly this creates a default value
                    }
            });

        Spinner barbarian = findViewById(R.id.barbarian);
        String[] barbarianOptions = new String[]{"Path of the Ancestral Guardian", "Path of the Battlerager", "Path of the Berserker", "Path of the Storm Herald", "Path of the Totem Warrior", "Path of the Zealot"};
        ArrayAdapter<String> barbarianAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, barbarianOptions);
        barbarian.setAdapter(barbarianAdapter);

        barbarian.setOnItemSelectedListener(new OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                    {
                        Log.v("barbarianSelect", (String) parent.getItemAtPosition(position));
                    }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                    {
                        // supposedly this creates a default value
                    }
            });

        Spinner bard = findViewById(R.id.bard);
        String[] bardOptions = new String[]{"College of Glamour", "College of Lore", "College of Satire", "College of Swords", "College of Valor", "College of Whispers"};
        ArrayAdapter<String> bardAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, bardOptions);
        bard.setAdapter(bardAdapter);

        bard.setOnItemSelectedListener(new OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                    {
                        Log.v("bardSelect", (String) parent.getItemAtPosition(position));
                    }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                    {
                        // supposedly this creates a default value
                    }
            });

        Spinner cleric = findViewById(R.id.cleric);
        String[] clericOptions = new String[]{"Arcana Domain", "Ambition Domain", "City Domain", "Death Domain", "Forge Domain",
                "Grave Domain", "Knowledge Domain", "Life Domain", "Light Domain", "Nature Domain",
                "Order Domain", "Protection Domain", "Solidarity Domain", "Strength Domain",
                "Tempest Domain", "Trickery Domain", "War Domain", "Zeal Domain"};
        ArrayAdapter<String> clericAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, clericOptions);
        cleric.setAdapter(clericAdapter);

        cleric.setOnItemSelectedListener(new OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                    {
                        Log.v("clericSelect", (String) parent.getItemAtPosition(position));
                    }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                    {
                        // supposedly this creates a default value
                    }
            });

        Spinner druid = findViewById(R.id.druid);
        String[] druidOptions = new String[]{"Circle of Dreams", "Circle of the Land", "Circle of the Moon",
                "Circle of the Shepherd", "Circle of Spores", "Circle of Twilight"};
        ArrayAdapter<String> druidAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, druidOptions);
        druid.setAdapter(druidAdapter);

        druid.setOnItemSelectedListener(new OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                    {
                        Log.v("druidSelect", (String) parent.getItemAtPosition(position));
                    }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                    {
                        // supposedly this creates a default value
                    }
            });

        Spinner fighter = findViewById(R.id.fighter);
        String[] fighterOptions = new String[]{"Arcane Archer", "Battlemaster", "Brute", "Cavalier",
                "Champion", "Eldritch Knight", "Monster Hunter", "Purple Dragon Knight", "Samurai",
                "Scout", "Sharpshooter"};
        ArrayAdapter<String> fighterAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, fighterOptions);
        fighter.setAdapter(fighterAdapter);

        fighter.setOnItemSelectedListener(new OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                    {
                        Log.v("fighterSelect", (String) parent.getItemAtPosition(position));
                    }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                    {
                        // supposedly this creates a default value
                    }
            });

        Spinner monk = findViewById(R.id.monk);
        String[] monkOptions = new String[]{"Way of the Drunken Master", "Way of the Four Elements",
                "Way of the Kensei", "Way of the Long Death", "Way of the Open Hand", "Way of Shadow",
                "Way of the Sun Soul", "Way of Tranquility"};
        ArrayAdapter<String> monkAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, monkOptions);
        monk.setAdapter(monkAdapter);

        monk.setOnItemSelectedListener(new OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                    {
                        Log.v("monkSelect", (String) parent.getItemAtPosition(position));
                    }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                    {
                        // supposedly this creates a default value
                    }
            });

        Spinner mystic = findViewById(R.id.mystic);
        String[] mysticOptions = new String[]{"Order of the Avatar", "Order of the Awakened", "Order of the Immortal",
                "Order of the Nomad", "Order of the Soul Knife", "Order of the Wu Jen"};
        ArrayAdapter<String> mysticAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, mysticOptions);
        mystic.setAdapter(mysticAdapter);

        mystic.setOnItemSelectedListener(new OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                    {
                        Log.v("mysticSelect", (String) parent.getItemAtPosition(position));
                    }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                    {
                        // supposedly this creates a default value
                    }
            });

        Spinner paladin = findViewById(R.id.paladin);
        String[] paladinOptions = new String[]{"Oath of the Ancients", "Oath of Conquest", "Oath of the Crown",
                "Oath of Devotion", "Oath of Redemption", "Oath of Vengeance", "Oathbreaker", "Oath of Treachery"};
        ArrayAdapter<String> paladinAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, paladinOptions);
        paladin.setAdapter(paladinAdapter);

        paladin.setOnItemSelectedListener(new OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                    {
                        Log.v("paladinSelect", (String) parent.getItemAtPosition(position));
                    }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                    {
                        // supposedly this creates a default value
                    }
            });

        Spinner ranger = findViewById(R.id.ranger);
        String[] rangerOptions = new String[]{"Beast Master", "Gloom Stalker",
                "Horizon Walker", "Hunter", "Monster Slayer", "Primeval Guardian"};
        ArrayAdapter<String> rangerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, rangerOptions);
        ranger.setAdapter(rangerAdapter);

        ranger.setOnItemSelectedListener(new OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                    {
                        Log.v("rangerSelect", (String) parent.getItemAtPosition(position));
                    }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                    {
                        // supposedly this creates a default value
                    }
            });

        Spinner rogue = findViewById(R.id.rogue);
        String[] rogueOptions = new String[]{"Arcane Trickster", "Assassin",
                "Inquisitive", "Mastermind", "Scout", "Swashbuckler", "Thief"};
        ArrayAdapter<String> rogueAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, rogueOptions);
        rogue.setAdapter(rogueAdapter);

        rogue.setOnItemSelectedListener(new OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                    {
                        Log.v("rogueSelect", (String) parent.getItemAtPosition(position));
                    }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                    {
                        // supposedly this creates a default value
                    }
            });

        Spinner sorcerer = findViewById(R.id.sorcerer);
        String[] sorcererOptions = new String[]{"Divine Soul", "Draconic Bloodline", "Giant Soul",
                "Phoenix Sorcery", "Pyromancer", "Sea Sorcery", "Shadow Magic",
                "Stone Sorcery", "Storm Sorcery", "Wild Magic"};
        ArrayAdapter<String> sorcererAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, sorcererOptions);
        sorcerer.setAdapter(sorcererAdapter);

        sorcerer.setOnItemSelectedListener(new OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                    {
                        Log.v("sorcererSelect", (String) parent.getItemAtPosition(position));
                    }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                    {
                        // supposedly this creates a default value
                    }
            });

        Spinner warlock = findViewById(R.id.warlock);
        String[] warlockOptions = new String[]{"The Archfey", "The Celestial", "The Fiend", "The Ghost in the Machine",
                "The Great Old One", "The Hexblade", "The Raven Queen", "The Seeker", "The Undying"};
        ArrayAdapter<String> warlockAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, warlockOptions);
        warlock.setAdapter(warlockAdapter);

        warlock.setOnItemSelectedListener(new OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                    {
                        Log.v("warlockSelect", (String) parent.getItemAtPosition(position));
                    }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                    {
                        // supposedly this creates a default value
                    }
            });

        Spinner wizard = findViewById(R.id.wizard);
        String[] wizardOptions = new String[]{"Bladesinger", "Lore Mastery", "School of Abjuration",
                "School of Conjuration", "School of Divination", "School of Enchantment", "School of Evocation",
                "School of Illusion", "School of Invention", "School of Necromancy", "School of Transmutation",
                "Technomancy", "Theurgy", "War Magic"};
        ArrayAdapter<String> wizardAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, wizardOptions);
        wizard.setAdapter(wizardAdapter);

        wizard.setOnItemSelectedListener(new OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                    {
                        Log.v("wizardSelect", (String) parent.getItemAtPosition(position));
                    }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                    {
                        // supposedly this creates a default value
                    }
            });

        ImageView background = (ImageView) findViewById(R.id.backgroundImg);
        int imageResource = getResources().getIdentifier("@drawable/parchment", null, this.getPackageName());
        background.setImageResource(imageResource);
        background.setScaleType(ImageView.ScaleType.FIT_XY);
    }
}
