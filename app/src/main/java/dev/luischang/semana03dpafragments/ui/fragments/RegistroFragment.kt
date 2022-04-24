package dev.luischang.semana03dpafragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import dev.luischang.semana03dpafragments.R

class RegistroFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_registro, container, false)

        val etFullName: EditText = view.findViewById(R.id.etFullName)
        val etEmail: EditText = view.findViewById(R.id.etEmail)
        val rgGender: RadioGroup = view.findViewById(R.id.rgGender)
        val spnCountry: Spinner = view.findViewById(R.id.spnCountry)
        val btnSave: Button = view.findViewById(R.id.btnSave)
        var countryValue = ""
        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.country_array,
            android.R.layout.simple_spinner_item
        ).also { adapter->
            adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
            spnCountry.adapter=adapter
        }
        //Obtener el valor del spinner
        spnCountry.onItemSelectedListener= object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                countryValue = parent?.getItemAtPosition(position).toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        btnSave.setOnClickListener {
            var fullNameValue = etFullName.text
            var emailValue = etEmail.text
            val intSelectButton = rgGender.checkedRadioButtonId
            val radioBUtton: RadioButton = view.findViewById(intSelectButton)
            val genderValue = radioBUtton.text

            Toast.makeText(requireContext(),"FullName : $fullNameValue", Toast.LENGTH_LONG).show()
            Toast.makeText(requireContext(),"Email : $emailValue", Toast.LENGTH_LONG).show()
            Toast.makeText(requireContext(),"Gender : $genderValue", Toast.LENGTH_LONG).show()
            Toast.makeText(requireContext(),"Country : $countryValue", Toast.LENGTH_LONG).show()

        }


        return view
    }
}