import React from 'react'
import Navbar from './Navbar'
import { useNavigate } from 'react-router-dom'

const HomePage = () => {

  const navigate = useNavigate()

  const handleFieldWorker = () => {
    navigate(`/fieldWorker`)
  }

  const handleUser = () => {
    navigate(`/userLogin`)
  }

  return (
    <div>
      <Navbar/>
      <div className='flex flex-row justify-evenly space-x-6 items-center mt-6 p-4'>
        <button className='bg-red-600 text-white rounded-lg px-2 py-2' onClick={handleUser}>USer</button>
        <button className='bg-red-600 text-white rounded-lg px-2 py-2' onClick={handleFieldWorker}>FieldWorker</button>
      </div>
    </div>
  )
}

export default HomePage