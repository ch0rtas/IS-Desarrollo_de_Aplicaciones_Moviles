package com.example.inicio.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.inicio.R
import com.example.inicio.databinding.ActivityContactDetailsBinding
import com.example.inicio.model.ContactJSON

class ContactDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContactDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Recuperar el objeto ContactJSON enviado desde el Adapter
        val contact = intent.getSerializableExtra("contact") as? ContactJSON

        contact?.let { c ->
            binding.textName.text = "${c.firstName} ${c.lastName}"
            binding.textEmail.text = "Email: ${c.email}"
            binding.textPhone.text = "Phone: ${c.phone}"
            binding.textAge.text = "Age: ${c.age ?: ""}"
            binding.textGender.text = "Gender: ${c.gender}"
            binding.textMaidenName.text = "Maiden Name: ${c.maidenName ?: ""}"
            binding.textUsername.text = "Username: ${c.username ?: ""}"
            binding.textPassword.text = "Password: ${c.password ?: ""}"
            binding.textBirthDate.text = "Birth Date: ${c.birthDate ?: ""}"
            binding.textBloodGroup.text = "Blood Group: ${c.bloodGroup ?: ""}"
            binding.textHeight.text = "Height: ${c.height ?: ""}"
            binding.textWeight.text = "Weight: ${c.weight ?: ""}"
            binding.textEyeColor.text = "Eye Color: ${c.eyeColor ?: ""}"
            binding.textHair.text = "Hair: ${c.hair?.color ?: ""}, ${c.hair?.type ?: ""}"
            binding.textIp.text = "IP: ${c.ip ?: ""}"
            binding.textAddress.text = "Address: ${c.address?.address ?: ""}, ${c.address?.city ?: ""}, ${c.address?.state ?: ""}, ${c.address?.postalCode ?: ""}, ${c.address?.country ?: ""}"
            binding.textMacAddress.text = "MAC Address: ${c.macAddress ?: ""}"
            binding.textUniversity.text = "University: ${c.university ?: ""}"
            binding.textBank.text = "Bank: ${c.bank?.cardType ?: ""} ${c.bank?.cardNumber ?: ""}"
            binding.textCompany.text = "Company: ${c.company?.name ?: ""}, ${c.company?.department ?: ""}, ${c.company?.title ?: ""}"
            binding.textEin.text = "EIN: ${c.ein ?: ""}"
            binding.textSsn.text = "SSN: ${c.ssn ?: ""}"
            binding.textUserAgent.text = "User Agent: ${c.userAgent ?: ""}"
            binding.textCrypto.text = "Crypto: ${c.crypto?.coin ?: ""}, ${c.crypto?.wallet ?: ""}, ${c.crypto?.network ?: ""}"
            binding.textRole.text = "Role: ${c.role ?: ""}"

            // Cargar la imagen con Glide
            Glide.with(this).load(c.image).placeholder(R.drawable.base).into(binding.imageContact)
        }
    }
}
